package serviceTest;

import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Home.service.impl.ArtMemberServiceImpl;
import com.qin.Home.service.inter.ArtMemberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

public class ArtMemberServiceTest {

    @Autowired
    @Qualifier(value = "artMemberServiceImpl")
    private ArtMemberService artMemberService;

    @Test
    public void queryAllMembersTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArtMemberServiceImpl bean = context.getBean("artMemberServiceImpl", ArtMemberServiceImpl.class);
        List<ArtMember> members = bean.queryAllMembers();
        for (ArtMember member : members) {
            System.out.println(member);
        }
    }

    @Test
    public void queryMemberInfoTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArtMemberServiceImpl bean = context.getBean("artMemberServiceImpl", ArtMemberServiceImpl.class);
        ArtMemberDTO dto = new ArtMemberDTO();
        dto.setUsername("测试");
        List<ArtMember> members = bean.queryMemberInfo(dto);
        for (ArtMember member : members) {
            System.out.println(member);
        }
    }

    @Test
    public void insertMemberTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArtMemberServiceImpl bean = context.getBean("artMemberServiceImpl", ArtMemberServiceImpl.class);
        ArtMember member = new ArtMember();
        member.setMobile("18820001000");
        member.setUsername("王测试");
        member.setStudentId("1234567891");
        member.setPassword("1234");
        member.setAccountType((byte) 2);
        int i = bean.insertMember(member);
        System.out.println(i);
    }

    @Test
    public void
}
