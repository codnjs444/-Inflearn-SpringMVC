package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void getInstance() {
    }

    @Test
    void save() {
        Member member1 = memberRepository.save(new Member("Member1", 20));
        Member findMember = memberRepository.findById(member1.getId());
        assertThat(findMember).isEqualTo(member1);
        System.out.println("member1 = " + member1);
        System.out.println("findMember = " + findMember);
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
        memberRepository.save(new Member("member1", 20));
        memberRepository.save(new Member("member2", 30));

        List<Member> memberList = memberRepository.findAll();
        System.out.println("memberList = " + memberList);

        assertThat(memberList.size()).isEqualTo(2);

    }

    @Test
    void clearStore() {
    }
}