public class strngbuild {
    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    //chatAt at index 0
    System.out.println(sb.charAt(0));

    // set char at index 0
    sb.setCharAt(0, 'p');
    System.out.println(sb);

    // insert
    sb.insert(0,'S');
    System.out.println(sb);

    //delete
    sb.delete(0,1);
    System.out.println(sb);

    sb.delete(0, 1);
    System.out.println(sb);
   
    sb.insert(0,'T');
    System.out.println(sb);
   

    
    }
}
