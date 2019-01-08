/**
 * Copyright (C) 2016 Matthieu Brouillard [http://oss.brouillard.fr/jgitver] (matthieu@brouillard.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.brouillard.oss.jgitver;

/**
 * Policies defining how jgitver will lookup version tags inside the repository.
 */
public enum LookupPolicy {
    /**
     * gather all reachable tags and take the greatest one.
     */
    MAX,
    /**
     * among reachable tags, keep the one having the most recent date.
     */
    LATEST,
    /**
     * among reachable tags, keep the one having the smallest depth from HEAD.
     * In case of depth equality, keep the latest among the depth equals tags.
     */
    NEAREST
}