package ParametersAndDataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterDemo {
    @Parameters({"env","name","pwd"})
    @Test

    public void parameterTest(String env,String name,String pwd){
        System.out.println("测试环境："+env+"登录名："+name+"密码："+pwd);
    }
}
