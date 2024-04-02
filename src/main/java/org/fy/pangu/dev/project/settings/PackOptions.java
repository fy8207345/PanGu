package org.fy.pangu.dev.project.settings;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PackOptions {

    private List<OptionsElement> ignore;
    private List<OptionsElement> include;

}
