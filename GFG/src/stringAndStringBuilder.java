public class stringAndStringBuilder {
    public static void main(String[] args) {
        //String
        String str="AHSAN";
        str.replace("ah","ts");
        System.out.println(str);
        str.indexOf("h");
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));

        //StringBuilder
        StringBuilder sv=new StringBuilder("ahsan");
        sv.reverse();
        sv.setCharAt(0,'3');
        System.out.println(sv);
        sv.append("siddz");
        sv.insert(0,"29");

        //String Reverse


                StringBuilder sb = new StringBuilder("HelloWorld");

                for(int i=0; i<sb.length()/2; i++) {
                    int front = i;
                    int back = sb.length() - i - 1;

                    char frontChar = sb.charAt(front);
                    char backChar = sb.charAt(back);

                    sb.setCharAt(front, backChar);
                    sb.setCharAt(back, frontChar);
                }

                System.out.println(sb);
    }
}
