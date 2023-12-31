package co.kr.lotte.dto.cs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CsPageRequestDTO {

    @Builder.Default
    private int pg =1;
    @Builder.Default
    private int size = 10;

    @Builder.Default
    private String cate = "member";
    @Builder.Default
    private String group = "notice";

    private int type;
    public Pageable getPageable(String sort){
        return PageRequest.of(this.pg-1, this.size, Sort.by(sort).descending());
    }

}