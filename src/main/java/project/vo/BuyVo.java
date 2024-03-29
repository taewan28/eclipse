package project.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@ToString
@AllArgsConstructor					
@NoArgsConstructor
@EqualsAndHashCode
public class BuyVo {
    private int buyIdx;
    private String customid;
    private String pcode;
    private int quantity;
    private Date buyDate;
    
}


