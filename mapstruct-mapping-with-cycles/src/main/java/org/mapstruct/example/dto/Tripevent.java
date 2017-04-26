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
package org.mapstruct.example.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Filip Hrisafov
 */
public class Tripevent implements Serializable {

    private long tripeventid;
    private Long activitytypeid;

    private String alertind;
    private String completedind;
    private Timestamp createdate;
    private String createdby;
    private List<TdfiFishgear> tdfiFishgears;

    public long getTripeventid() {
        return tripeventid;
    }

    public void setTripeventid(long tripeventid) {
        this.tripeventid = tripeventid;
    }

    public Long getActivitytypeid() {
        return activitytypeid;
    }

    public void setActivitytypeid(Long activitytypeid) {
        this.activitytypeid = activitytypeid;
    }

    public String getAlertind() {
        return alertind;
    }

    public void setAlertind(String alertind) {
        this.alertind = alertind;
    }

    public String getCompletedind() {
        return completedind;
    }

    public void setCompletedind(String completedind) {
        this.completedind = completedind;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public List<TdfiFishgear> getTdfiFishgears() {
        return tdfiFishgears;
    }

    public void setTdfiFishgears(List<TdfiFishgear> tdfiFishgears) {
        this.tdfiFishgears = tdfiFishgears;
    }
}
