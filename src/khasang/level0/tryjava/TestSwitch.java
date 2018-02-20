package khasang.level0.tryjava;

public class TestSwitch {
    public static void main(String[] args) {
        String Str = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о'));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о', 8));
        System.out.print("Найденный индекс: ");
        System.out.println( Str.indexOf(SubStr1));
        System.out.print("Найденный индекс: ");
        System.out.println( Str.indexOf(SubStr1, 19));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf("su"));




        /*double index = IMT(1.85, 95);
        System.out.printf("%.2f",index);*/

        /*int [] arr = {3,2,5,0,-1};
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }


        }
        System.out.println(Arrays.toString(arr));*/
    }

    private static double IMT(double height, int weight) {
        double index;
        index = weight/(height*height);
        return index;


    }
}

