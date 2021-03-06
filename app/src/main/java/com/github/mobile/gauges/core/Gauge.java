/*
 * Copyright 2012 GitHub Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.mobile.gauges.core;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * Gauge information
 */
public class Gauge implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = -8423297822694434626L;

    private DatedViewSummary today;

    private List<DatedViewSummary> recentDays;

    private String id;

    private String title;

    /**
     * @param recentDays
     * @return this gauge
     */
    public Gauge setRecentDays(List<DatedViewSummary> recentDays) {
        this.recentDays = recentDays;
        return this;
    }

    /**
     * @return recentDays
     */
    public List<DatedViewSummary> getRecentDays() {
        return recentDays != null ? recentDays : Collections.<DatedViewSummary> emptyList();
    }

    /**
     * @return today
     */
    public DatedViewSummary getToday() {
        return today;
    }

    /**
     * @param today
     * @return this gauge
     */
    public Gauge setToday(DatedViewSummary today) {
        this.today = today;
        return this;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     * @return this gauge
     */
    public Gauge setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     * @return this gauge
     */
    public Gauge setTitle(String title) {
        this.title = title;
        return this;
    }
}
