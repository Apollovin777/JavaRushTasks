package com.javarush.task.task09.task0908;

/* 
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.ми
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        try {

            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println(e.getClass());
        }

    }
}
