/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api;

/**
 * Provides a domain object of the given type.
 *
 * @param <T> type of domain object
 * @since 4.10
 */
@Incubating
public interface NamedDomainObjectProvider<T> extends DomainObjectProvider<T> {
    /**
     * The domain object name referenced by this provider.
     * <p>
     * Must be constant for the life of the object.
     *
     * @return The domain object. Never null.
     * @since 4.10
     */
    String getName();
}
