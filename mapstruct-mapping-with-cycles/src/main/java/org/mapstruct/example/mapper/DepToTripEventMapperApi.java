/**
 * Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 * and/or other contributors as indicated by the @authors tag. See the
 * copyright.txt file in the distribution for a full listing of all
 * contributors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mapstruct.example.mapper;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.example.dto.Dep;
import org.mapstruct.example.dto.Tripevent;

/**
 * @author Filip Hrisafov
 */
@Mapper(uses = FishGearMapper.class)
public interface DepToTripEventMapperApi {

    @Mappings({
        @Mapping(target = "createdby", source = "regUserId"),
        @Mapping(target = "createdate",
            expression = "java(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()))"),
        @Mapping(target = "activitytypeid", source = "depDto.activity"),
        @Mapping(target = "alertind", constant = "N"),
        @Mapping(target = "completedind", constant = "N"),
        @Mapping(target = "tripeventid", ignore = true),
        @Mapping(target = "tdfiFishgears", source = "depDto.gea"),
    })
    Tripevent DepDtoToTripEvent(Dep depDto, String regUserId, Long messageId, @Context String regUser);
}
