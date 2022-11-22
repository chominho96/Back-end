package j2b.nft_generator.file.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 서버에 이미지를 저장할하고나서 반환하는 DTO입니다.
 * @version 1.0.0
 * @author CHO Min Ho
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileUploadToServerReqDTO {
    private String fileName;
    private String filePath;
}
