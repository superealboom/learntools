package com.afuo.learntools;

import com.afuo.learntools.mapper.UserMapper;
import com.afuo.learntools.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class LearntoolsApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }


    @Test
    public void addUser() {
        User user = new User();
        user.setAge(23);
        user.setEmail("123@163.com");
        user.setName("路超");

        int insert = userMapper.insert(user);
        System.out.println(insert);
    }


    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1360105967127670786L);
        user.setAge(120);

        int update = userMapper.updateById(user);
        System.out.println(update);

    }


    /*
     * @Author afuo
     * @Description //测试乐观锁
     * @Date 2021/2/12 14:36
     * @Param []
     * @return void
     **/
    @Test
    public void testOptimisticLocker() {
        User user = userMapper.selectById(1360115719513628673L);
        user.setAge(45);
        userMapper.updateById(user);
    }


    @Test
    public void testSelectUsers() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        System.out.println(users);
    }

    //分页查询
    @Test
    public void testPage() {
        Page<User> page = new Page<>(1,3);//当前页，每页显示记录数

        //把分页所有数据封装到page对象里面去
        userMapper.selectPage(page, null);

        System.out.println(page.getCurrent());//当前页
        System.out.println(page.getRecords());//每页数据list集合
        System.out.println(page.getSize());//每页显示记录数
        System.out.println(page.getTotal());//总记录数
        System.out.println(page.getPages());//总页数

        System.out.println(page.hasNext());//是否有下一页
        System.out.println(page.hasPrevious());//是否有上一页
    }


    @Test
    public void testDeleteById() {
        int i = userMapper.deleteById(1360129213390753793L);
        System.out.println(i);
    }


    @Test
    public void testDeleteByIds() {
        int result = userMapper.deleteBatchIds(Arrays.asList(1360068393025785858L, 1360105967127670786L));
        System.out.println(result);
    }


    @Test
    public void testSelectQuery() {
        //创建QueryWrapper对象
        QueryWrapper queryWrapper = new QueryWrapper<>();

        //通过QueryWrapper设置条件


        //1. ge ≥, gt ≤, le ＞, lt ＜
//        queryWrapper.ge("age", 30);
//        List<User> userList = userMapper.selectList(queryWrapper);
//        System.out.println(userList);


        //2. eq 相等，ne 不相等

        //3. between 包含val2，不包含val1
//        queryWrapper.between("age", 23, 45);
//        List<User> userList = userMapper.selectList(queryWrapper);
//        System.out.println(userList);

        //4. like、notLike、likeLeft、likeRight

        //5. orderBy、orderByDesc、orderByAsc

        //6. last

        //7. select 指定列

    }

}
