package com.qin.Home.controller;

import com.qin.Common.entity.domain.ArtMember;
import com.qin.Home.service.inter.ArtMemberService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/artMember")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtMemberController {
    //controller调service层

    @Qualifier(value = "artMemberServiceImpl")
    @Autowired
    private ArtMemberService artMemberService;

    //    @RequestMapping("/memberInfo")
//    public String queryMember(Model model, ArtMemberDTO artMemberDTO) {
//        artMemberDTO.setMobile("18810002000");
//        List<ArtMember> members = artMemberService.queryMemberInfo(artMemberDTO);
//        model.addAttribute("members",members);
//        return "memberInfo";
//    }

    @RequestMapping("/allMembers")
    @ResponseBody
    public String queryAllMembers() {
        List<ArtMember> members = artMemberService.queryAllMembers();
        for (ArtMember member : members) {
            System.out.println(member);
        }
        return "allMembers";
    }

}
