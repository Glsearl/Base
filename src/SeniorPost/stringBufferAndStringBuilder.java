package SeniorPost;

public class stringBufferAndStringBuilder {
    private static final int ITERATTIONS =100000;
    private static final int BufferSize=16;
    private void concatString(){
        System.out.println("comcatString ->");
        long startTime =System.currentTimeMillis();
        String concat ="";
        for (int i=0;i<ITERATTIONS;i++){
            concat +=i%10;
        }
        long endTime =System.currentTimeMillis();
       System.out.println("length"+concat.length());
       //统计循环整个过程的时间
        System.out.println("time"+(endTime-startTime));

    }
    //StringBuilder
    private void concatStringBuilder(){
        System.out.println("comcatStringBuilder ->");
        long startTime =System.currentTimeMillis();
        StringBuilder concat =new StringBuilder();
        for (int i=0;i<ITERATTIONS;i++){
            concat.append(i%10);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("length"+concat.length());
        //统计循环整个过程的时间
        System.out.println("time"+(endTime-startTime));

    }
    //StringBuffer
    private void concatStringBuffer(){
        System.out.println("comcatStringBuffer ->");
        long startTime =System.currentTimeMillis();
        StringBuffer concat =new StringBuffer();
        for (int i=0;i<ITERATTIONS;i++){
            concat.append(i%10);
        }
        long endTime =System.currentTimeMillis();
        System.out.println("length"+concat.length());
        //统计循环整个过程的时间
        System.out.println("time"+(endTime-startTime));

    }
    public static void main(String[] args){
        String str =new String("Hello");
        str +="BeiJing";
        StringBuffer stb =new StringBuffer("Hello");
        stb.append("BeiJing");
        StringBuilder strd =new StringBuilder("Hello");
        strd.append("BeiJing");
        stringBufferAndStringBuilder st=new stringBufferAndStringBuilder();
        System.out.println("Iterations:"+ITERATTIONS);
        System.out.println("Buffer:"+BufferSize);
        st.concatString();
        st.concatStringBuffer();
        st.concatStringBuilder();
    }


}
