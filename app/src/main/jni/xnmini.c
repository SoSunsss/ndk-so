#include "com_example_administrator_saredemo_utils_NativeUtils.h"
/**
 * 上边的引用一定要和.h的文件名加后缀，
 * 下面的方法名一定要和.h文件中的方法名称一样
 */
JNIEXPORT jstring JNICALL Java_com_example_administrator_saredemo_utils_NativeUtils_getStringFromNative
            (JNIEnv *env, jobject obj) {
        return (*env)->NewStringUTF(env, "小尼玛其乐无穷");
}
