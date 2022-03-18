// public static void main(String[] args) {

//         // '' : Used for character
//         // " ": Used for String
//         // In an expression a String is a must in order to treat the expression as a String
//         // If one of the datatype is String ans will be String
//         System.out.println("a" + "b");

//         System.out.println("a" + 'b');


//          // Performance
//          // Very bad Solution because every time we add a new alphabet it creates a new object
//          String series = "";
//          for (int i = 0; i < 26; i++){
//              char ch = (char)('a' + i);
//              series += ch;
//              System.out.println(series);
//           // System.out.print(ch + " ");
//       }

        // String Builder Class
        // StringBuilder builder = new StringBuilder();

        // for (int i = 0; i < 26; i++) {
        //     char ch = (char) ('a' + i);
        //     builder.append(ch);
        // }
        
        // // It is not creating a new object it is appending the values in the same object
        // System.out.println(builder);
//     }    
