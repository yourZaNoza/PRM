package rpm_11.serialization;

import java.io.Serializable;

public class Bill implements Serializable {
    private Long id;
    private Integer amount;
    private Boolean isOverdraftEnabled;
    private static final long serialVersionUID = 83498134L;

    public Bill(Long id, Integer amount, Boolean isOverdraftEnabled) {
        this.id = id;
        this.amount = amount;
        this.isOverdraftEnabled = isOverdraftEnabled;
    }

    public Bill() {
        this.id = 0L;
        this.amount = 0;
        this.isOverdraftEnabled = false;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setOverdraftEnabled(Boolean overdraftEnabled) {
        this.isOverdraftEnabled = overdraftEnabled;
    }

    public Boolean getOverdraftEnabled() {
        return isOverdraftEnabled;
    }
}
