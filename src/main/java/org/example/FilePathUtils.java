package org.example;
import java.io.File;

public class FilePathUtils {
    public static String getStandardPath(String folder, String filename) {
        // Tạo đường dẫn chuẩn theo OS
        String path = folder + File.separator + filename;
        // Chuẩn hóa: Biến tất cả thành dấu gạch xuôi / để so sánh thống nhất
        return path.replace("\\", "/");
    }
}
