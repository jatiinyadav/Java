class HelloWorld {
    public static void main(String[] args) {

      // * 
      // * * 
      // * * * 
      // * * * *
        for (int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

      // * * * *
      // * * * *
      // * * * *
      // * * * *
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // 1
        // 12
        // 123
        // 1234
        // 12345
        for (int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 1
        // 22
        // 333
        // 4444
        // 55555
        for (int i = 1; i <=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 0; i <=4; i++){
            for(int j = 0 ; j <= 4-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 12345
        // 1234
        // 123
        // 12
        // 1
       for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= 6-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //     *
        //    ***
        //   *****
        //  *******
        // *********
        int l = (5 * 2 - 1)/2;
		for (int i = 1; i <= 5; i++){
            
            for(int k = 0; k < l; k++){
                System.out.print(" ");
            }
            
            for(int j = 1; j < i * 2; j++){
                System.out.print("*");
            }
            
            l--;
            System.out.println();
        }

	// 1 
	// 0 1 
	// 1 0 1 
	// 0 1 0 1 
	// 1 0 1 0 1    
	int start = 1;
	for (int i = 0; i < 5; i++){
		if(i % 2 == 0) start = 1;
		else start = 0;
            	for(int j = 0; j <= i; j++){
                	if(start == 0){
                    	System.out.print(0 + " ");
                    	start = 1;
                	} 
			else {
                    		System.out.print(1 + " ");
                    		start = 0;
			}
            }
            System.out.println();
        }
	
        // *****
        //  ***
        //   *
	int space = 0;
        for(int i = 0; i <=5; i++){
            for (int k = 0; k < space; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= 5 * 2 - i; j++){
                System.out.print("*");
            }
            space++;
            System.out.println();
        }

	// 1         1
	// 1 2     2 1
	// 1 2 3 3 2 1
	        int spaces = n * 2 - 2;
		
		for(int i = 0; i < n; i++){
		    for(int j = 0; j <= i; j++){
		        System.out.print(j + 1 + " ");
		    }
		    
		    for(int k = 0; k < spaces; k++){
		        System.out.print(' ');
		    }
		    
		    for(int j = i; j >= 0; j--){
		        System.out.print(j + 1 + " ");
		    }
		    
		    spaces = spaces - 2;
		    System.out.println();
		}
	// * * * * * * 
	// * *     * * 
	// *         * 
	// *         * 
	// * *     * * 
	// * * * * * * 
	    	int spaces = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n - i; j++){
		        System.out.print("* ");
		    }
		    
		    for(int k = 0; k < spaces; k++){
		        System.out.print(' ');
		    }
		    
		    for(int z = n - i; z > 0; z--){
		        System.out.print("* ");
		    }
		    spaces = spaces + 2;
		    
		    System.out.println();
		}
		spaces = n * 2 - 2;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j <= i; j++){
		        System.out.print("* ");
		    }
		    
		    for(int k = 0; k < spaces; k++){
		        System.out.print(' ');
		    }
		    
		    for(int z = i; z >= 0; z--){
		        System.out.print("* ");
		    }
		    spaces = spaces - 2;
		    
		    System.out.println();
		}
 	// 4444444
	// 4333334
	// 4322234
	// 4321234
	// 4322234
	// 4333334
	// 4444444
	int n = 4;
        for(int i = 0; i < n * 2 - 1; i++){
            for(int j = 0; j < n * 2 - 1; j++){
                int top = i;
                int left = j;
                int right = n * 2 - 2 - j;
                int bottom = n * 2 - 2 -i;
                
                System.out.print(n -  Math.min(Math.min(top, left), Math.min(right, bottom)));
            }
            System.out.println();
        }
    }
}
