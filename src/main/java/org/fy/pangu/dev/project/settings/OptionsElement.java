package org.fy.pangu.dev.project.settings;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OptionsElement {

    private String value;
    private String type;
}
