package co.kr.lotte.service.member;


import co.kr.lotte.dto.member.MemberDTO;
import co.kr.lotte.entity.member.MemberTermsEntity;
import co.kr.lotte.entity.member.MemberEntity;
import co.kr.lotte.repository.member.TermsRepository;
import co.kr.lotte.repository.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private TermsRepository termsRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public MemberTermsEntity findByTerms(){
        return termsRepository.findById(1).get();
    }

    public void save(MemberDTO dto){
        dto.setPass1(passwordEncoder.encode(dto.getPass1())); // 비밀번호 암호화
        MemberEntity entity = dto.toEntity(); // DTO를 Entity로 변환
        memberRepository.save(entity); // DB insert
    }

    public int countUid(String uid){
        return memberRepository.countByUid(uid);
    }
}
