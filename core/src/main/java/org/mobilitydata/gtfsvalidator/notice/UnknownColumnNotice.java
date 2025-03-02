/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mobilitydata.gtfsvalidator.notice;

/**
 * A column name is unknown.
 *
 * <p>Severity: {@code SeverityLevel.INFO}
 */
public class UnknownColumnNotice extends ValidationNotice {

  // The name of the faulty file.
  private final String filename;

  // The name of the unknown column.
  private final String fieldName;

  // The index of the faulty column.
  private final int index;

  public UnknownColumnNotice(String filename, String fieldName, int index) {
    super(SeverityLevel.INFO);
    this.filename = filename;
    this.fieldName = fieldName;
    this.index = index;
  }
}
