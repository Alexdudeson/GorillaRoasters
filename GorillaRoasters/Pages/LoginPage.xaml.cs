using GorillaRoasters.RandomColorButton;
using GorillaRoasters.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace GorillaRoasters.Pages
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class LoginPage : ContentPage
    {
        private LoginPageVM _viewModel;
        public LoginPage()
        {
            InitializeComponent();
            _viewModel = new LoginPageVM();
            BindingContext = _viewModel;
        }
        private async void Button_OnClicked(object sender, EventArgs e)
        {while (true)
            {
                ((ColorButtonRND)sender).ChangeColor(sender, e);
                //TimeSpan interval = new TimeSpan(0, 0, 1);
                await Task.Delay(150);
            }
        }
    }

}