package semohan.semohan.domain.member.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MemberUpdateDto {
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "비밀번호는 8자리 이상이어야 하며, 영문자와 숫자를 포함해야 합니다.")
    private String password;
    private String repeatedPassword;

    @Length(max = 30, message = "닉네임은 최대 30자까지 입력 가능합니다.")
    private String nickname;

    @Pattern(regexp= "\\d{3}-\\d{4}-\\d{4}", message="알맞은 형식의 휴대폰 번호를 입력해주세요.")
    private String phoneNumber;

    private Date birthday;
}
