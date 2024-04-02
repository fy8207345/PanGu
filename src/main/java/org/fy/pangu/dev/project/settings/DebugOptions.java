package org.fy.pangu.dev.project.settings;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DebugOptions {

    private List<OptionsElement> hidedInDevtools;

}
