/*
 * VCSStatusIcons.java
 *
 * Copyright (C) 2009-11 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.common.vcs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface VCSStatusIcons extends ClientBundle
{
   public final static VCSStatusIcons INSTANCE =
         GWT.create(VCSStatusIcons.class);

   public abstract ImageResource untracked();
   public abstract ImageResource modified();
   public abstract ImageResource added();
   public abstract ImageResource deleted();
   public abstract ImageResource renamed();
   public abstract ImageResource copied();
   public abstract ImageResource unmerged();
}
