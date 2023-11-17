package com.azhe.tagster.util;

import cn.hutool.core.util.CharUtil;
import cn.hutool.crypto.digest.DigestUtil;

/**
 * @author: azhe
 * @description: java SHA256加密工具
 * @date: 2023/11/16 23:37
 */

public class EncryptSha256Util {
    public static String sha256Hex(String data) {
        return DigestUtil.sha256Hex(data);
    }

}
