// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package mobi.hsz.idea.gitignore.file.type.kind

import mobi.hsz.idea.gitignore.file.type.IgnoreFileType
import mobi.hsz.idea.gitignore.lang.kind.ElasticBeanstalkLanguage

/**
 * Describes ElasticBeanstalk file type.
 */
class ElasticBeanstalkFileType : IgnoreFileType(ElasticBeanstalkLanguage.INSTANCE) {

    companion object {
        val INSTANCE = ElasticBeanstalkFileType()
    }
}
