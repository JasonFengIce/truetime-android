package cn.ismartv.truetime;

import android.util.Log;

class TrueLog {

    private static boolean LOGGING_ENABLED = true;

    public static void v(String tag, String msg) {
        if (LOGGING_ENABLED) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LOGGING_ENABLED) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LOGGING_ENABLED) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LOGGING_ENABLED) {
            Log.w(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable t) {
        if (LOGGING_ENABLED) {
            Log.w(tag, msg, t);
        }
    }

    public static void e(String tag, String msg) {
        if (LOGGING_ENABLED) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable t) {
        if (LOGGING_ENABLED) {
            Log.e(tag, msg, t);
        }
    }

    public static void wtf(String tag, String msg) {
        if (LOGGING_ENABLED) {
            Log.wtf(tag, msg);
        }
    }

    public static void wtf(String tag, String msg, Throwable tr) {
        if (LOGGING_ENABLED) {
            Log.wtf(tag, msg, tr);
        }
    }

    static void setLoggingEnabled(boolean isLoggingEnabled) {
        LOGGING_ENABLED = isLoggingEnabled;
    }
}
