package day_twenty_seven.DynamicProxy;

/**
 * @ Author     ：gaols
 * @ Date       ：Created in 11:19 2019/4/1
 * @Version: $
 */
public class StudentDaoImpl implements StudentDao{
    @Override
    public void add() {
        System.out.println("添加功能");
    }

    @Override
    public void delete() {
        System.out.println("删除功能");
    }

    @Override
    public void update() {
        System.out.println("更新功能");
    }

    @Override
    public void find() {
        System.out.println("查询功能");
    }
}
