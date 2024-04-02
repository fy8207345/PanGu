package org.fy.pangu.dev.project.settings;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class WatchOptions {

    private List<String> ignore;
}
