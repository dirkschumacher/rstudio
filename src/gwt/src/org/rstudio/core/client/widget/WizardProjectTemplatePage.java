/*
 * WizardProjectTemplatePage.java
 *
 * Copyright (C) 2009-16 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.core.client.widget;

import org.rstudio.studio.client.projects.model.ProjectTemplateDescription;
import org.rstudio.studio.client.projects.ui.newproject.NewDirectoryPage;

public class WizardProjectTemplatePage extends NewDirectoryPage
{
   public WizardProjectTemplatePage(ProjectTemplateDescription description)
   {
      super(description.getTitle(),
            description.getSubTitle(),
            description.getPageCaption(),
            description.getIcon(),
            description.getIconLarge());
   }
}