package com.javarush.task.task20.task2002;

import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("vasja");
            user.setLastName("pupkin");
            user.setMale(true);
            user.setBirthDate(new Date());
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);

            String isUsersPresent = users != null ? "yes" : "no";
            writer.println(isUsersPresent);

            if (isUsersPresent!=null){
                writer.println(users.size());
                for (User u:this.users) {
                    if (u.getFirstName()!=null){
                        writer.println("yes");
                        writer.println(u.getFirstName());
                    }
                    else
                        writer.println("no");

                    if (u.getLastName()!=null){
                        writer.println("yes");
                        writer.println(u.getLastName());
                    }
                    else
                        writer.println("no");

                    if (u.getBirthDate()!=null){
                        writer.println("yes");
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        formatter = formatter.withLocale( Locale.ENGLISH );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
                        //LocalDate date = LocalDate.parse("2005-nov-12", formatter);
                        LocalDate date = u.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        writer.println(date.format(formatter).toString());
                    }
                    else
                        writer.println("no");

                    writer.println(u.isMale());

                    if (u.getCountry()!=null){
                        writer.println("yes");
                        writer.println(u.getCountry().getDisplayedName());
                    }
                    else
                        writer.println("no");
                    writer.flush();
                    writer.close();
                }

            }

        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String isUsersPresent = reader.readLine();
            int count =Integer.parseInt(reader.readLine());
            if (count>0)
            {
                for (int i =0;i<count;i++) {
                    User u = new User();

                    String param = reader.readLine();
                    if (param.equals("yes"))
                        u.setFirstName(reader.readLine());
                    else
                        u.setFirstName(null);

                    if (reader.readLine().equals("yes"))
                        u.setLastName(reader.readLine());
                    else
                        u.setFirstName(null);

                    if (reader.readLine().equals("yes")){
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        formatter = formatter.withLocale(Locale.ENGLISH);
                        LocalDate localDate = LocalDate.parse(reader.readLine(), formatter);
                        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                        u.setBirthDate(date);
                    } else
                        u.setBirthDate(null);

                    u.setMale(reader.readLine().equals("true"));

                    if (reader.readLine().equals("yes"))
                        switch (reader.readLine()) {
                            case "Russia":
                                u.setCountry(User.Country.RUSSIA);
                                break;
                            case "Ukraine":
                                u.setCountry(User.Country.UKRAINE);
                                break;
                            case "Other":
                                u.setCountry(User.Country.OTHER);
                                break;
                        }
                    else
                        u.setCountry(null);
                    reader.close();

                    users.add(i,u);
                }

            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
