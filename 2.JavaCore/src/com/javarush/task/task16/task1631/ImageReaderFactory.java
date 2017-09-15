package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Yurko on 28.05.2017.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader (ImageTypes imageType) throws IllegalArgumentException {
             try {
                if (imageType.name ().equals ( "BMP" )) return new BmpReader ();
                if (imageType.name ().equals ( "JPG" )) return new JpgReader ();
                if (imageType.name ().equals ( "PNG" )) return new PngReader ();
            }
            catch (Exception e){
                throw new IllegalArgumentException ( "Неизвестный тип картинки" );
            }
            return null;
        }


}
