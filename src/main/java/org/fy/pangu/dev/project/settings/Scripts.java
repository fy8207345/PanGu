package org.fy.pangu.dev.project.settings;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Scripts {

    /**
     * 编译前预处理命令
     */
    private String beforeCompile;
    /**
     * 预览前预处理命令
     */
    private String beforePreview;
    /**
     * 上传前预处理命令
     */
    private String beforeUpload;
}
