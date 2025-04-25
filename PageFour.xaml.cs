using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NewRelic.MAUI.Plugin;

namespace MauiApp2;

public partial class PageFour : ContentPage
{

    public static void Sort(int[] array)
    {
        int n = array.Length;
        bool swapped; // Flag to optimize for already sorted arrays

        do
        {
            swapped = false;
            for (int i = 0; i < n - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    // Swap elements
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public PageFour()
    {
        InitializeComponent();
    }
    
    private void OnRecordMetricClicked(object sender, EventArgs e)
    {
        CrossNewRelic.Current.RecordMetric("This is a test metric", "category", 100);
    }
    
    private void OnCrashClicked(object sender, EventArgs e)
    {
        String message  = null;
        
        message.Substring(100);
    }
    
    private void OnANRClicked(object sender, EventArgs e)
    {
        //while (true)
       // {
            // Do nothing
        //}
        CrossNewRelic.Current.LogInfo("Started Bubble Sort");
        var rand = new Random();

        int maxcount = 100000000;
        int[] terms = new int[maxcount];
        for (int runs = 0; runs < maxcount; runs++)
        {
            terms[runs] = rand.Next(5, 100000);
        }

        Sort(terms);
       CrossNewRelic.Current.LogInfo("Completed Started Bubble Sort");
    }
}