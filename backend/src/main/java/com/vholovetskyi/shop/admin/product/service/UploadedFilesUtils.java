package com.vholovetskyi.shop.admin.product.service;

import com.github.slugify.Slugify;
import org.apache.commons.io.FilenameUtils;

class UploadedFilesUtils {
    public static String slugifyFileName(String filename) {
        String name = FilenameUtils.getBaseName(filename);
        Slugify slg = new Slugify();
        String changeName = slg
                .withCustomReplacement("_", "-")
                .slugify(name);
        return changeName + "." + FilenameUtils.getExtension(filename);
    }
}
