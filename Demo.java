public class Demo{
  public static void main(String[] args){
    if (args.length==0) printLoop(5);
    else printLoop(Integer.parseInt(args[0]));
    int[][] array1 = {{1,2,3,4,5}, {2,4,6,8,10}};
    System.out.println(arrDeepToString(array1));
    System.out.println(arrDeepToString(create2DArray(4,4,4)));
    System.out.println(arrDeepToString(create2DArrayRandomized(6, 4, 4)));
    System.out.println(arrDeepToString(create2DArrayRandomized(4, 10, 100)));
  }
  public static void printLoop(int n) {
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=(n-i)+1; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static String arrToString(int[] arr){
    String str ="";
    if (arr.length==0) str="{}";
    else {
      str="{"+String.valueOf(arr[0]);
      for (int i=1; i<arr.length; i++) {
        str+=", "+ String.valueOf(arr[i]);
      }
      str+="}";
    }
    return str;
  }
  public static String arrDeepToString(int[][] arr){
    String str="";
    if (arr.length==0) str="{}";
    else {
      str+="{"+arrToString(arr[0]);
      for (int i=1; i<arr.length; i++) {
        str+=", "+arrToString(arr[i]);
      }
    }
    str+="}";
    return str;
  }
  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr=new int[rows][cols];
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        arr[i][j]=(int) (Math.random()*(maxValue+1));
      }
    }
    return arr;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr=new int[rows][];
    for (int i=0; i<rows;i++) {
      arr[i]= new int[(int) (Math.random()*(cols+1))];
    }
    for (int i=0; i<rows; i++) {
      for (int j=0; j<arr[i].length; j++) {arr[i][j]=(int) (Math.random()*(maxValue+1));
      }
    }
    return arr;
  }
}
