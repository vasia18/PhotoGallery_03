package ry.photogallery_03;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

//эти методы помогают уменьшить размер изображений для повышения производительности
class pfotoHelper {
    public static int calculateInSampleSize(BitmapFactory.Options options, int regWidth, int regHeight) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if (height > regHeight || width > regWidth) {
            final int halfHeight = height / 2;
            final int halfWidth = width / 2;
            while ((halfHeight / inSampleSize) >= regHeight && (halfWidth / inSampleSize) >= regWidth) {
                inSampleSize += 2;
            }
        }
        return inSampleSize;
    }

    public static Bitmap DecodeSample(String pathName, int regWidth, int regHeight) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(pathName, options);
        options.inSampleSize = calculateInSampleSize(options, regWidth, regHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(pathName, options);
    }
}
