package exception.instances;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private boolean critical;

    CustomException(String message, boolean isCritical) {
        super(message);
        this.critical = isCritical;
    }

}
