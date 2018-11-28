package StringBufferDemo;

public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        //添加功能
        sb.append(1);
        sb.append(2);
        sb.append(3);
        sb.append(4);
        System.out.println(sb);
        //删除功能
        sb.delete(0,2);
        System.out.println(sb);
        //替换功能
        sb.replace(0,1,"你好");
        System.out.println(sb);
        sb.append("Hello java");
        //返回一个新的字符串,截取功能
        sb.substring(1,3);
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
      sb.toString();
      String s="你好啊";
      StringBuffer stringBuffer=new StringBuffer(s);
      System.out.println(stringBuffer);
    }
}
