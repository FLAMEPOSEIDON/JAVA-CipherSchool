public class Lecture22 {
    



    //*******************************************************************************/
     
           
        public static void main(String a[]){ 
            /*
            int[] arr1 = {9,14,3,2,43,11,58,22};  
            System.out.println("Before Selection Sort");  
            for(int i:arr1){  
                System.out.print(i+" ");  
            }  
            System.out.println();  
              
            selectionSort(arr1);//sorting
            System.out.println("After apply Selection Sort");  
            for(int i:arr1){  
                System.out.print(i+" ");  
            }
            */
            
            
            // String 
            String name1="chandan";
            String name2="chandan";
            
            String name3=new String("chandan");
            String name4=new String("chandan");
            
            System.out.println(name1==name2);
            System.out.println(name3==name4);
            System.out.println(name3==name3);
            // String is immutable
            //
            //concetation
            /*//==============================================/*
            String ok="chandan";
            ok=ok+"Kushwaha";
            System.out.println(ok);
            ===============================================
            */
            
            //======================
            String ll=new String("chandan");
            String GG=new String(" Kushwaha");
            ll=ll.concat(GG);
            System.out.println(ll);
    //==============================================
    //equals function just like ==     
        }
    }