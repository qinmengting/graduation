import com.qin.Common.entity.domain.ArtMember;
import com.qin.Common.entity.dto.ArtMemberDTO;
import com.qin.Home.service.inter.ArtMemberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration(locations = {
//        "classpath:spring-mvc.xml"
//})
@AutoConfigureMockMvc
@Transactional
public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArtMemberService bean = context.getBean("ArtMemberServiceImpl", ArtMemberService.class);
        ArtMemberDTO dto = new ArtMemberDTO();
        dto.setMobile("18810002000");
        List<ArtMember> members = bean.queryMemberInfo(dto);
        for (ArtMember member : members) {
            System.out.println(member);
        }
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArtMemberService bean = context.getBean("ArtMemberServiceImpl", ArtMemberService.class);
        List<ArtMember> members = bean.queryAllMembers();
        for (ArtMember member : members) {
            System.out.println(member);
        }
    }


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void test03() throws Exception {
            mockMvc.perform((post("/artMember/allMembers")));

    }


}
