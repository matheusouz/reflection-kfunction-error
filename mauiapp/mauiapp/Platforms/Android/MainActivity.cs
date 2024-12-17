using Android.App;
using Android.Content.PM;
using Android.OS;
using Com.Test.Reflect_error_test;

namespace mauiapp;

[Activity(Theme = "@style/Maui.SplashTheme", MainLauncher = true, LaunchMode = LaunchMode.SingleTop, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize | ConfigChanges.Density)]
public class MainActivity : MauiAppCompatActivity
{

    protected override void OnCreate(Bundle? savedInstanceState)
    {
        base.OnCreate(savedInstanceState);

        Test test = new Test();

        test.ExecuteMyMethodDirectly();
        test.ExecuteMyMethodByReflection();
    }
}

