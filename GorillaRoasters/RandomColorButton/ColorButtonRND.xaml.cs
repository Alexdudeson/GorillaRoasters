using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace GorillaRoasters.RandomColorButton
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class ColorButtonRND : Button
    {
        private Random rndm = new Random();
        public ColorButtonRND()
        {
            
            Text = "Clicked";
            TextColor = Color.Black;
            BackgroundColor = Color.Blue;
            Margin = new Thickness(20);
            VerticalOptions = LayoutOptions.CenterAndExpand;
            HorizontalOptions = LayoutOptions.FillAndExpand;

            Clicked += ChangeColor;
        }

        public void ChangeColor(object sender, EventArgs e)
        {
            var content = (Button)sender;
            content.BackgroundColor = Color.FromRgb(rndm.Next(256), rndm.Next(256), rndm.Next(256));
            //return true;
        }
    }
}