package serviceTest;

import com.qin.Common.entity.domain.ArtMember;
import com.qin.Home.service.impl.ArtMemberServiceImpl;
import com.qin.Home.service.inter.ArtMemberService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ArtMemberServiceTest {

    @Autowired
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
}
