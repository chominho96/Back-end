package j2b.nft_generator.nft.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * NFT 추가 폼에서 사용되는 DTO입니다.
 * @version 1.0.0
 * @author CHO Min Ho
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddNftDTO {
    private String nameInput;
    private String descriptionInput;
    private int priceInput;
    private double royaltyInput;
    private String privilegeInput;
}
