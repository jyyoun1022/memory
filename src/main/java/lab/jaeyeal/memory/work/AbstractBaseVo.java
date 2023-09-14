package lab.jaeyeal.memory.work;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.Serializable;

public abstract class AbstractBaseVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @Getter
    private final String lang = LocaleContextHolder.getLocale().getLanguage();
}