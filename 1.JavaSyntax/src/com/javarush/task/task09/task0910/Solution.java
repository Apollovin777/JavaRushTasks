package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getClass());
        }
        //напишите тут ваш код
    }
}