package lab.jaeyeal.memory.work;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CommonResponseVo<T> {
    @Builder.Default
    private boolean result      = true;
    @Builder.Default
    private boolean isAuthError = false;
    private String  code;
    private String  message;

    // Response Data
    private T data;

    // Response Paging Data If response is paging one.
    private PagingVo paging;
}
